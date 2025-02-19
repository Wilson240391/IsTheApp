package com.github.midros.istheapp.services.accessibilityData;

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
public final class AccessibilityDataService_MembersInjector implements MembersInjector<AccessibilityDataService> {
  private final Provider<InteractorAccessibilityData> interactorProvider;

  public AccessibilityDataService_MembersInjector(
      Provider<InteractorAccessibilityData> interactorProvider) {
    this.interactorProvider = interactorProvider;
  }

  public static MembersInjector<AccessibilityDataService> create(
      Provider<InteractorAccessibilityData> interactorProvider) {
    return new AccessibilityDataService_MembersInjector(interactorProvider);
  }

  @Override
  public void injectMembers(AccessibilityDataService instance) {
    injectInteractor(instance, interactorProvider.get());
  }

  @InjectedFieldSignature("com.github.midros.istheapp.services.accessibilityData.AccessibilityDataService.interactor")
  public static void injectInteractor(AccessibilityDataService instance,
      InteractorAccessibilityData interactor) {
    instance.interactor = interactor;
  }
}
