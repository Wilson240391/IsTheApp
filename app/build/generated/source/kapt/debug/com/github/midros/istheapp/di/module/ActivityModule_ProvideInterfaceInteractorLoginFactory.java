package com.github.midros.istheapp.di.module;

import com.github.midros.istheapp.ui.activities.login.InteractorLogin;
import com.github.midros.istheapp.ui.activities.login.InterfaceInteractorLogin;
import com.github.midros.istheapp.ui.activities.login.InterfaceViewLogin;
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
public final class ActivityModule_ProvideInterfaceInteractorLoginFactory implements Factory<InterfaceInteractorLogin<InterfaceViewLogin>> {
  private final ActivityModule module;

  private final Provider<InteractorLogin<InterfaceViewLogin>> interactorProvider;

  public ActivityModule_ProvideInterfaceInteractorLoginFactory(ActivityModule module,
      Provider<InteractorLogin<InterfaceViewLogin>> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public InterfaceInteractorLogin<InterfaceViewLogin> get() {
    return provideInterfaceInteractorLogin(module, interactorProvider.get());
  }

  public static ActivityModule_ProvideInterfaceInteractorLoginFactory create(ActivityModule module,
      Provider<InteractorLogin<InterfaceViewLogin>> interactorProvider) {
    return new ActivityModule_ProvideInterfaceInteractorLoginFactory(module, interactorProvider);
  }

  public static InterfaceInteractorLogin<InterfaceViewLogin> provideInterfaceInteractorLogin(
      ActivityModule instance, InteractorLogin<InterfaceViewLogin> interactor) {
    return Preconditions.checkNotNullFromProvides(instance.provideInterfaceInteractorLogin(interactor));
  }
}
