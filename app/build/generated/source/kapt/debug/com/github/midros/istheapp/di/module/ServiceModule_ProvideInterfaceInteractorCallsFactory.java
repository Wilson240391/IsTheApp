package com.github.midros.istheapp.di.module;

import com.github.midros.istheapp.services.calls.InteractorCalls;
import com.github.midros.istheapp.services.calls.InterfaceInteractorCalls;
import com.github.midros.istheapp.services.calls.InterfaceServiceCalls;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;
import javax.inject.Provider;

@ScopeMetadata("com.github.midros.istheapp.di.PerService")
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
public final class ServiceModule_ProvideInterfaceInteractorCallsFactory implements Factory<InterfaceInteractorCalls<InterfaceServiceCalls>> {
  private final ServiceModule module;

  private final Provider<InteractorCalls<InterfaceServiceCalls>> interactorProvider;

  public ServiceModule_ProvideInterfaceInteractorCallsFactory(ServiceModule module,
      Provider<InteractorCalls<InterfaceServiceCalls>> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public InterfaceInteractorCalls<InterfaceServiceCalls> get() {
    return provideInterfaceInteractorCalls(module, interactorProvider.get());
  }

  public static ServiceModule_ProvideInterfaceInteractorCallsFactory create(ServiceModule module,
      Provider<InteractorCalls<InterfaceServiceCalls>> interactorProvider) {
    return new ServiceModule_ProvideInterfaceInteractorCallsFactory(module, interactorProvider);
  }

  public static InterfaceInteractorCalls<InterfaceServiceCalls> provideInterfaceInteractorCalls(
      ServiceModule instance, InteractorCalls<InterfaceServiceCalls> interactor) {
    return Preconditions.checkNotNullFromProvides(instance.provideInterfaceInteractorCalls(interactor));
  }
}
