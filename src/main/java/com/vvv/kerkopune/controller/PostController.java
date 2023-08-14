package com.vvv.kerkopune.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vvv.kerkopune.service.ILocationService;
import com.vvv.kerkopune.service.IPostService;
import com.vvv.kerkopune.view.pub.Location;
import com.vvv.kerkopune.view.pub.PostView;

@RestController
@RequestMapping("posts")
public class PostController {

	@Autowired
	IPostService postService;
	
	@Autowired
	ILocationService locationService;

	@GetMapping(value = "")
	public PostView getTags(@RequestParam(value = "page", required = false, defaultValue = "1") Integer pageId) {
		return postService.getPublicPostView(pageId);
	}
	
	@GetMapping(value = "/locations")
	public List<Location> getLocationList() {
		return locationService.getLocationList();
	}
}
