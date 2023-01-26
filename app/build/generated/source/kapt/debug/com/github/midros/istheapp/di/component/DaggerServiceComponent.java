package com.github.midros.istheapp.di.component;

import android.content.Context;
import com.github.midros.istheapp.data.rxFirebase.InterfaceFirebase;
import com.github.midros.istheapp.di.module.ServiceModule;
import com.github.midros.istheapp.di.module.ServiceModule_ProvideContextFactory;
import com.github.midros.istheapp.di.module.ServiceModule_ProvideInterfaceInteractorCallsFactory;
import com.github.midros.istheapp.di.module.ServiceModule_ProvideInterfaceInteractorSmsFactory;
import com.github.midros.istheapp.services.calls.CallsService;
import com.github.midros.istheapp.services.calls.CallsService_MembersInjector;
import com.github.midros.istheapp.services.calls.InteractorCalls;
import com.github.midros.istheapp.services.calls.InteractorCalls_Factory;
import com.github.midros.istheapp.services.calls.InterfaceInteractorCalls;
import com.github.midros.istheapp.services.calls.InterfaceServiceCalls;
import com.github.midros.istheapp.services.sms.InteractorSms;
import com.github.midros.istheapp.services.sms.InteractorSms_Factory;
import com.github.midros.istheapp.services.sms.InterfaceInteractorSms;
import com.github.midros.istheapp.services.sms.InterfaceServiceSms;
import com.github.midros.istheapp.services.sms.SmsService;
import com.github.midros.istheapp.services.sms.SmsService_MembersInjector;
import com.github.midros.istheapp.services.social.InteractorMonitorService;
import com.github.midros.istheapp.services.social.MonitorService;
import com.github.midros.istheapp.services.social.MonitorService_MembersInjector;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerServiceComponent {
  private DaggerServiceComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ServiceModule serviceModule;

    private AppComponent appComponent;

    private Builder() {
    }

    public Builder serviceModule(ServiceModule serviceModule) {
      this.serviceModule = Preconditions.checkNotNull(serviceModule);
      return this;
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }

    public ServiceComponent build() {
      Preconditions.checkBuilderRequirement(serviceModule, ServiceModule.class);
      Preconditions.checkBuilderRequirement(appComponent, AppComponent.class);
      return new ServiceComponentImpl(serviceModule, appComponent);
    }
  }

  private static final class ServiceComponentImpl implements ServiceComponent {
    private final ServiceModule serviceModule;

    private final AppComponent appComponent;

    private final ServiceComponentImpl serviceComponentImpl = this;

    private Provider<Context> provideContextProvider;

    private Provider<InterfaceFirebase> getInterfaceFirebaseProvider;

    private Provider<InteractorCalls<InterfaceServiceCalls>> interactorCallsProvider;

    private Provider<InterfaceInteractorCalls<InterfaceServiceCalls>> provideInterfaceInteractorCallsProvider;

    private Provider<InteractorSms<InterfaceServiceSms>> interactorSmsProvider;

    private Provider<InterfaceInteractorSms<InterfaceServiceSms>> provideInterfaceInteractorSmsProvider;

    private ServiceComponentImpl(ServiceModule serviceModuleParam, AppComponent appComponentParam) {
      this.serviceModule = serviceModuleParam;
      this.appComponent = appComponentParam;
      initialize(serviceModuleParam, appComponentParam);

    }

    private InteractorMonitorService interactorMonitorService() {
      return new InteractorMonitorService(ServiceModule_ProvideContextFactory.provideContext(serviceModule), Preconditions.checkNotNullFromComponent(appComponent.getInterfaceFirebase()));
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ServiceModule serviceModuleParam,
        final AppComponent appComponentParam) {
      this.provideContextProvider = ServiceModule_ProvideContextFactory.create(serviceModuleParam);
      this.getInterfaceFirebaseProvider = new GetInterfaceFirebaseProvider(appComponentParam);
      this.interactorCallsProvider = InteractorCalls_Factory.create(provideContextProvider, getInterfaceFirebaseProvider);
      this.provideInterfaceInteractorCallsProvider = DoubleCheck.provider(ServiceModule_ProvideInterfaceInteractorCallsFactory.create(serviceModuleParam, interactorCallsProvider));
      this.interactorSmsProvider = InteractorSms_Factory.create(provideContextProvider, getInterfaceFirebaseProvider);
      this.provideInterfaceInteractorSmsProvider = DoubleCheck.provider(ServiceModule_ProvideInterfaceInteractorSmsFactory.create(serviceModuleParam, interactorSmsProvider));
    }

    @Override
    public void inject(CallsService callsService) {
      injectCallsService(callsService);
    }

    @Override
    public void inject(SmsService smsService) {
      injectSmsService(smsService);
    }

    @Override
    public void inject(MonitorService monitorService) {
      injectMonitorService(monitorService);
    }

    @CanIgnoreReturnValue
    private CallsService injectCallsService(CallsService instance) {
      CallsService_MembersInjector.injectInteractor(instance, provideInterfaceInteractorCallsProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private SmsService injectSmsService(SmsService instance) {
      SmsService_MembersInjector.injectInteractor(instance, provideInterfaceInteractorSmsProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private MonitorService injectMonitorService(MonitorService instance) {
      MonitorService_MembersInjector.injectInteractor(instance, interactorMonitorService());
      return instance;
    }

    private static final class GetInterfaceFirebaseProvider implements Provider<InterfaceFirebase> {
      private final AppComponent appComponent;

      GetInterfaceFirebaseProvider(AppComponent appComponent) {
        this.appComponent = appComponent;
      }

      @Override
      public InterfaceFirebase get() {
        return Preconditions.checkNotNullFromComponent(appComponent.getInterfaceFirebase());
      }
    }
  }
}
