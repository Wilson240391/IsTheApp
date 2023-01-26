package com.github.midros.istheapp.di.module;

import com.github.midros.istheapp.ui.fragments.maps.InteractorMaps;
import com.github.midros.istheapp.ui.fragments.maps.InterfaceInteractorMaps;
import com.github.midros.istheapp.ui.fragments.maps.InterfaceViewMaps;
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
public final class ActivityModule_ProvideInterfaceInteractorMapsFactory implements Factory<InterfaceInteractorMaps<InterfaceViewMaps>> {
  private final ActivityModule module;

  private final Provider<InteractorMaps<InterfaceViewMaps>> interactorProvider;

  public ActivityModule_ProvideInterfaceInteractorMapsFactory(ActivityModule module,
      Provider<InteractorMaps<InterfaceViewMaps>> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public InterfaceInteractorMaps<InterfaceViewMaps> get() {
    return provideInterfaceInteractorMaps(module, interactorProvider.get());
  }

  public static ActivityModule_ProvideInterfaceInteractorMapsFactory create(ActivityModule module,
      Provider<InteractorMaps<InterfaceViewMaps>> interactorProvider) {
    return new ActivityModule_ProvideInterfaceInteractorMapsFactory(module, interactorProvider);
  }

  public static InterfaceInteractorMaps<InterfaceViewMaps> provideInterfaceInteractorMaps(
      ActivityModule instance, InteractorMaps<InterfaceViewMaps> interactor) {
    return Preconditions.checkNotNullFromProvides(instance.provideInterfaceInteractorMaps(interactor));
  }
}
