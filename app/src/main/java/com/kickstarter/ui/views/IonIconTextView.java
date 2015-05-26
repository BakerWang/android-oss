package com.kickstarter.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.kickstarter.KsrApplication;
import com.kickstarter.libs.Font;

import javax.inject.Inject;

public class IonIconTextView extends TextView {
  @Inject Font font;

  public IonIconTextView(final Context context) {
    super(context);
  }

  public IonIconTextView(final Context context, final AttributeSet attrs) {
    super(context, attrs);
  }

  public IonIconTextView(final Context context, final AttributeSet attrs, final int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @Override
  protected void onFinishInflate() {
    super.onFinishInflate();

    if (isInEditMode()) {
      return;
    }

    ((KsrApplication) getContext().getApplicationContext()).component().inject(this);
    setTypeface(font.ionIconTypeface());
  }
}
