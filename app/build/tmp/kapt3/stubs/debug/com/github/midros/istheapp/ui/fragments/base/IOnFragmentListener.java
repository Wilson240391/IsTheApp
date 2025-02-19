package com.github.midros.istheapp.ui.fragments.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/github/midros/istheapp/ui/fragments/base/IOnFragmentListener;", "", "onBackPressed", "", "onHideFragment", "", "app_debug"})
public abstract interface IOnFragmentListener {
    
    public abstract boolean onBackPressed();
    
    public abstract void onHideFragment();
}