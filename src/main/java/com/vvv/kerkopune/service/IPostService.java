package com.vvv.kerkopune.service;

import com.vvv.kerkopune.view.pub.PostView;

public interface IPostService {
	PostView getPublicPostView(Integer page);
}
