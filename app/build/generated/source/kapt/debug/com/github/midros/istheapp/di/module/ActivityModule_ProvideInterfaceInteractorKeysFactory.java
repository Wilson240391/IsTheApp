package com.github.midros.istheapp.di.module;

import com.github.midros.istheapp.ui.fragments.keylog.InteractorKeys;
import com.github.midros.istheapp.ui.fragments.keylog.InterfaceInteractorKeys;
import com.github.midros.istheapp.ui.fragments.keylog.InterfaceViewKeys;
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
public final class ActivityModule_ProvideInterfaceInteractorKeysFactory implements Factory<InterfaceInteractorKeys<InterfaceViewKeys>> {
  private final ActivityModule module;

  private final Provider<InteractorKeys<InterfaceViewKeys>> interactorProvider;

  public ActivityModule_ProvideInterfaceInteractorKeysFactory(ActivityModule module,
      Provider<InteractorKeys<InterfaceViewKeys>> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public InterfaceInteractorKeys<InterfaceViewKeys> get() {
    return provideInterfaceInteractorKeys(module, interactorProvider.get());
  }

  public static ActivityModule_ProvideInterfaceInteractorKeysFactory create(ActivityModule module,
      Provider<InteractorKeys<InterfaceViewKeys>> interactorProvider) {
    return new ActivityModule_ProvideInterfaceInteractorKeysFactory(module, interactorProvider);
  }

  public static InterfaceInteractorKeys<InterfaceViewKeys> provideInterfaceInteractorKeys(
      ActivityModule instance, InteractorKeys<InterfaceViewKeys> interactor) {
    return Preconditions.checkNotNullFromProvides(instance.provideInterfaceInteractorKeys(interactor));
  }
}
