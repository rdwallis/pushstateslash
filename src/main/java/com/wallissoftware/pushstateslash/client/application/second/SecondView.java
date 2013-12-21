package com.wallissoftware.pushstateslash.client.application.second;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class SecondView extends ViewImpl implements SecondPresenter.MyView {
	interface Binder extends UiBinder<Widget, SecondView> {
	}

	@Inject
	SecondView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}


}
