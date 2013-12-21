package com.wallissoftware.pushstateslash.client.application.first;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class FirstView extends ViewImpl implements FirstPresenter.MyView {
	interface Binder extends UiBinder<Widget, FirstView> {
	}

	

	@Inject
	FirstView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
