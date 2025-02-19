package com.github.midros.istheapp.di.module;

import com.github.midros.istheapp.ui.fragments.recording.InteractorRecording;
import com.github.midros.istheapp.ui.fragments.recording.InterfaceInteractorRecording;
import com.github.midros.istheapp.ui.fragments.recording.InterfaceViewRecording;
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
public final class ActivityModule_ProvideInterfaceInteractorRecordingFactory implements Factory<InterfaceInteractorRecording<InterfaceViewRecording>> {
  private final ActivityModule module;

  private final Provider<InteractorRecording<InterfaceViewRecording>> interactorProvider;

  public ActivityModule_ProvideInterfaceInteractorRecordingFactory(ActivityModule module,
      Provider<InteractorRecording<InterfaceViewRecording>> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public InterfaceInteractorRecording<InterfaceViewRecording> get() {
    return provideInterfaceInteractorRecording(module, interactorProvider.get());
  }

  public static ActivityModule_ProvideInterfaceInteractorRecordingFactory create(
      ActivityModule module,
      Provider<InteractorRecording<InterfaceViewRecording>> interactorProvider) {
    return new ActivityModule_ProvideInterfaceInteractorRecordingFactory(module, interactorProvider);
  }

  public static InterfaceInteractorRecording<InterfaceViewRecording> provideInterfaceInteractorRecording(
      ActivityModule instance, InteractorRecording<InterfaceViewRecording> interactor) {
    return Preconditions.checkNotNullFromProvides(instance.provideInterfaceInteractorRecording(interactor));
  }
}
