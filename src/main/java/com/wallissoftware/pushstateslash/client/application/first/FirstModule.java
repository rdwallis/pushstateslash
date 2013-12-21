package com.wallissoftware.pushstateslash.client.application.first;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class FirstModule extends AbstractPresenterModule {
	@Override
	protected void configure() {
		bindPresenter(FirstPresenter.class, FirstPresenter.MyView.class,
				FirstView.class, FirstPresenter.MyProxy.class);
	}
}
