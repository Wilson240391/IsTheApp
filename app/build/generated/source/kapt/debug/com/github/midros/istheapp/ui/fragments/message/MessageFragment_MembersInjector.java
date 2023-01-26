package com.github.midros.istheapp.ui.fragments.message;

import androidx.recyclerview.widget.LinearLayoutManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.Generated;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MessageFragment_MembersInjector implements MembersInjector<MessageFragment> {
  private final Provider<InterfaceInteractorMessage<InterfaceViewMessage>> interactorProvider;

  private final Provider<LinearLayoutManager> layoutMProvider;

  public MessageFragment_MembersInjector(
      Provider<InterfaceInteractorMessage<InterfaceViewMessage>> interactorProvider,
      Provider<LinearLayoutManager> layoutMProvider) {
    this.interactorProvider = interactorProvider;
    this.layoutMProvider = layoutMProvider;
  }

  public static MembersInjector<MessageFragment> create(
      Provider<InterfaceInteractorMessage<InterfaceViewMessage>> interactorProvider,
      Provider<LinearLayoutManager> layoutMProvider) {
    return new MessageFragment_MembersInjector(interactorProvider, layoutMProvider);
  }

  @Override
  public void injectMembers(MessageFragment instance) {
    injectInteractor(instance, interactorProvider.get());
    injectLayoutM(instance, layoutMProvider.get());
  }

  @InjectedFieldSignature("com.github.midros.istheapp.ui.fragments.message.MessageFragment.interactor")
  public static void injectInteractor(MessageFragment instance,
      InterfaceInteractorMessage<InterfaceViewMessage> interactor) {
    instance.interactor = interactor;
  }

  @InjectedFieldSignature("com.github.midros.istheapp.ui.fragments.message.MessageFragment.layoutM")
  public static void injectLayoutM(MessageFragment instance, LinearLayoutManager layoutM) {
    instance.layoutM = layoutM;
  }
}
