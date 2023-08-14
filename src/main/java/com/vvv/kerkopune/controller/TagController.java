package com.vvv.kerkopune.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vvv.kerkopune.service.ITagService;
import com.vvv.kerkopune.view.pub.TagView;

@RestController
@RequestMapping("tags")
public class TagController {

	@Autowired
	ITagService tagService;

	@GetMapping(value = "")
	public TagView getTags(@RequestParam(value = "page", required = false, defaultValue = "1") Integer pageId) {
		return tagService.getPublicTagView(pageId);
	}

}
