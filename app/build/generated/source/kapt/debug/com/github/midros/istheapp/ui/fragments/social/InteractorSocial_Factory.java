package com.github.midros.istheapp.ui.fragments.social;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.github.midros.istheapp.data.rxFirebase.InterfaceFirebase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class InteractorSocial_Factory<V extends InterfaceViewSocial> implements Factory<InteractorSocial<V>> {
  private final Provider<FragmentManager> supportFragmentProvider;

  private final Provider<Context> contextProvider;

  private final Provider<InterfaceFirebase> firebaseProvider;

  public InteractorSocial_Factory(Provider<FragmentManager> supportFragmentProvider,
      Provider<Context> contextProvider, Provider<InterfaceFirebase> firebaseProvider) {
    this.supportFragmentProvider = supportFragmentProvider;
    this.contextProvider = contextProvider;
    this.firebaseProvider = firebaseProvider;
  }

  @Override
  public InteractorSocial<V> get() {
    return newInstance(supportFragmentProvider.get(), contextProvider.get(), firebaseProvider.get());
  }

  public static <V extends InterfaceViewSocial> InteractorSocial_Factory<V> create(
      Provider<FragmentManager> supportFragmentProvider, Provider<Context> contextProvider,
      Provider<InterfaceFirebase> firebaseProvider) {
    return new InteractorSocial_Factory<V>(supportFragmentProvider, contextProvider, firebaseProvider);
  }

  public static <V extends InterfaceViewSocial> InteractorSocial<V> newInstance(
      FragmentManager supportFragment, Context context, InterfaceFirebase firebase) {
    return new InteractorSocial<V>(supportFragment, context, firebase);
  }
}
