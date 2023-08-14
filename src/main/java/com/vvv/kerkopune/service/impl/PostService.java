package com.vvv.kerkopune.service.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vvv.kerkopune.repository.IPostRepository;
import com.vvv.kerkopune.service.IPostService;
import com.vvv.kerkopune.view.pub.PostView;

@Service
public class PostService implements IPostService {

	@Autowired
	private IPostRepository postRepository;

	@Override
	public PostView getPublicPostView(Integer page) {

		ObjectMapper mapper = new ObjectMapper();

		ClassPathResource cp = new ClassPathResource("data/data-post-p" + page + ".json");
		if (cp.exists()) {
			try {
				return mapper.readValue(cp.getInputStream(), PostView.class);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		PostView pv = new PostView();
		return pv;
	}

}
