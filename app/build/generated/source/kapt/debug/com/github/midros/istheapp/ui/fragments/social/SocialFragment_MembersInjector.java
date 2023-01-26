package com.github.midros.istheapp.ui.fragments.social;

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
public final class SocialFragment_MembersInjector implements MembersInjector<SocialFragment> {
  private final Provider<InterfaceInteractorSocial<InterfaceViewSocial>> interactorProvider;

  public SocialFragment_MembersInjector(
      Provider<InterfaceInteractorSocial<InterfaceViewSocial>> interactorProvider) {
    this.interactorProvider = interactorProvider;
  }

  public static MembersInjector<SocialFragment> create(
      Provider<InterfaceInteractorSocial<InterfaceViewSocial>> interactorProvider) {
    return new SocialFragment_MembersInjector(interactorProvider);
  }

  @Override
  public void injectMembers(SocialFragment instance) {
    injectInteractor(instance, interactorProvider.get());
  }

  @InjectedFieldSignature("com.github.midros.istheapp.ui.fragments.social.SocialFragment.interactor")
  public static void injectInteractor(SocialFragment instance,
      InterfaceInteractorSocial<InterfaceViewSocial> interactor) {
    instance.interactor = interactor;
  }
}
