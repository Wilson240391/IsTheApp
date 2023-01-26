package com.github.midros.istheapp.di.module;

import com.github.midros.istheapp.ui.activities.register.InteractorRegister;
import com.github.midros.istheapp.ui.activities.register.InterfaceInteractorRegister;
import com.github.midros.istheapp.ui.activities.register.InterfaceViewRegister;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;
import javax.inject.Provider;

@ScopeMetadata("com.github.midros.istheapp.di.PerActivity")
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
public final class ActivityModule_ProvideInterfaceInteractorRegisterFactory implements Factory<InterfaceInteractorRegister<InterfaceViewRegister>> {
  private final ActivityModule module;

  private final Provider<InteractorRegister<InterfaceViewRegister>> interactorProvider;

  public ActivityModule_ProvideInterfaceInteractorRegisterFactory(ActivityModule module,
      Provider<InteractorRegister<InterfaceViewRegister>> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public InterfaceInteractorRegister<InterfaceViewRegister> get() {
    return provideInterfaceInteractorRegister(module, interactorProvider.get());
  }

  public static ActivityModule_ProvideInterfaceInteractorRegisterFactory create(
      ActivityModule module,
      Provider<InteractorRegister<InterfaceViewRegister>> interactorProvider) {
    return new ActivityModule_ProvideInterfaceInteractorRegisterFactory(module, interactorProvider);
  }

  public static InterfaceInteractorRegister<InterfaceViewRegister> provideInterfaceInteractorRegister(
      ActivityModule instance, InteractorRegister<InterfaceViewRegister> interactor) {
    return Preconditions.checkNotNullFromProvides(instance.provideInterfaceInteractorRegister(interactor));
  }
}
