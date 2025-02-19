package com.github.midros.istheapp.services.social;

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
public final class MonitorService_MembersInjector implements MembersInjector<MonitorService> {
  private final Provider<InteractorMonitorService> interactorProvider;

  public MonitorService_MembersInjector(Provider<InteractorMonitorService> interactorProvider) {
    this.interactorProvider = interactorProvider;
  }

  public static MembersInjector<MonitorService> create(
      Provider<InteractorMonitorService> interactorProvider) {
    return new MonitorService_MembersInjector(interactorProvider);
  }

  @Override
  public void injectMembers(MonitorService instance) {
    injectInteractor(instance, interactorProvider.get());
  }

  @InjectedFieldSignature("com.github.midros.istheapp.services.social.MonitorService.interactor")
  public static void injectInteractor(MonitorService instance,
      InteractorMonitorService interactor) {
    instance.interactor = interactor;
  }
}
