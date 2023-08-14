package com.vvv.kerkopune.service.impl;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vvv.kerkopune.repository.ITagRepository;
import com.vvv.kerkopune.service.ITagService;
import com.vvv.kerkopune.view.pub.Tag;
import com.vvv.kerkopune.view.pub.TagView;

@Service
public class TagService implements ITagService {

	@Autowired
	private ITagRepository tagRepository;
	
	@Override
	public TagView getPublicTagView(Integer page) {
		ObjectMapper mapper = new ObjectMapper();

		ClassPathResource cp = new ClassPathResource("data/data-tagview-p" + page + ".json");
		if (cp.exists()) {
			try {
				return mapper.readValue(cp.getInputStream(), TagView.class);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		TagView tv = new TagView();
		tv.setTags(new ArrayList<Tag>());
		tv.setCurrentPage(0);
		tv.setLastPage(0);
		tv.setTotal(0);
		return tv;

	}

}
