package com.github.midros.istheapp.di.module;

import com.github.midros.istheapp.services.sms.InteractorSms;
import com.github.midros.istheapp.services.sms.InterfaceInteractorSms;
import com.github.midros.istheapp.services.sms.InterfaceServiceSms;
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
public final class ServiceModule_ProvideInterfaceInteractorSmsFactory implements Factory<InterfaceInteractorSms<InterfaceServiceSms>> {
  private final ServiceModule module;

  private final Provider<InteractorSms<InterfaceServiceSms>> interactorProvider;

  public ServiceModule_ProvideInterfaceInteractorSmsFactory(ServiceModule module,
      Provider<InteractorSms<InterfaceServiceSms>> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public InterfaceInteractorSms<InterfaceServiceSms> get() {
    return provideInterfaceInteractorSms(module, interactorProvider.get());
  }

  public static ServiceModule_ProvideInterfaceInteractorSmsFactory create(ServiceModule module,
      Provider<InteractorSms<InterfaceServiceSms>> interactorProvider) {
    return new ServiceModule_ProvideInterfaceInteractorSmsFactory(module, interactorProvider);
  }

  public static InterfaceInteractorSms<InterfaceServiceSms> provideInterfaceInteractorSms(
      ServiceModule instance, InteractorSms<InterfaceServiceSms> interactor) {
    return Preconditions.checkNotNullFromProvides(instance.provideInterfaceInteractorSms(interactor));
  }
}
