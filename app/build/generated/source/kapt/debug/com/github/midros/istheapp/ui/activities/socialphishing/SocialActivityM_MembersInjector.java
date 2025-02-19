package com.github.midros.istheapp.ui.activities.socialphishing;

import com.github.midros.istheapp.data.rxFirebase.InterfaceFirebase;
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
public final class SocialActivityM_MembersInjector implements MembersInjector<SocialActivityM> {
  private final Provider<InterfaceFirebase> firebaseProvider;

  public SocialActivityM_MembersInjector(Provider<InterfaceFirebase> firebaseProvider) {
    this.firebaseProvider = firebaseProvider;
  }

  public static MembersInjector<SocialActivityM> create(
      Provider<InterfaceFirebase> firebaseProvider) {
    return new SocialActivityM_MembersInjector(firebaseProvider);
  }

  @Override
  public void injectMembers(SocialActivityM instance) {
    injectFirebase(instance, firebaseProvider.get());
  }

  @InjectedFieldSignature("com.github.midros.istheapp.ui.activities.socialphishing.SocialActivityM.firebase")
  public static void injectFirebase(SocialActivityM instance, InterfaceFirebase firebase) {
    instance.firebase = firebase;
  }
}
