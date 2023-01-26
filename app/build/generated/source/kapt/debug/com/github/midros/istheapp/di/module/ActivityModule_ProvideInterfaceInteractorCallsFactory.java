package com.github.midros.istheapp.di.module;

import com.github.midros.istheapp.ui.fragments.calls.InteractorCalls;
import com.github.midros.istheapp.ui.fragments.calls.InterfaceInteractorCalls;
import com.github.midros.istheapp.ui.fragments.calls.InterfaceViewCalls;
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
public final class ActivityModule_ProvideInterfaceInteractorCallsFactory implements Factory<InterfaceInteractorCalls<InterfaceViewCalls>> {
  private final ActivityModule module;

  private final Provider<InteractorCalls<InterfaceViewCalls>> interactorProvider;

  public ActivityModule_ProvideInterfaceInteractorCallsFactory(ActivityModule module,
      Provider<InteractorCalls<InterfaceViewCalls>> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public InterfaceInteractorCalls<InterfaceViewCalls> get() {
    return provideInterfaceInteractorCalls(module, interactorProvider.get());
  }

  public static ActivityModule_ProvideInterfaceInteractorCallsFactory create(ActivityModule module,
      Provider<InteractorCalls<InterfaceViewCalls>> interactorProvider) {
    return new ActivityModule_ProvideInterfaceInteractorCallsFactory(module, interactorProvider);
  }

  public static InterfaceInteractorCalls<InterfaceViewCalls> provideInterfaceInteractorCalls(
      ActivityModule instance, InteractorCalls<InterfaceViewCalls> interactor) {
    return Preconditions.checkNotNullFromProvides(instance.provideInterfaceInteractorCalls(interactor));
  }
}
