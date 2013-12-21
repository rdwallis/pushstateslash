package com.wallissoftware.pushstateslash.client.application.second;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.wallissoftware.pushstateslash.client.application.ApplicationPresenter;
import com.wallissoftware.pushstateslash.client.place.NameTokens;

public class SecondPresenter extends
		Presenter<SecondPresenter.MyView, SecondPresenter.MyProxy> {
	interface MyView extends View {
	}

	@ContentSlot
	public static final Type<RevealContentHandler<?>> SLOT_Second = new Type<RevealContentHandler<?>>();

	@NameToken(NameTokens.second)
	@ProxyStandard
	public interface MyProxy extends ProxyPlace<SecondPresenter> {
	}

	@Inject
	public SecondPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
		super(eventBus, view, proxy, ApplicationPresenter.TYPE_SetMainContent);

	}

}
