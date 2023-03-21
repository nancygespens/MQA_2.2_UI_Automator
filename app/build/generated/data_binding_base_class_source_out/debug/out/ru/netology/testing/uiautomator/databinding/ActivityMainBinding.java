// Generated by view binder compiler. Do not edit!
package ru.netology.testing.uiautomator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import ru.netology.testing.uiautomator.R;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonActivity;

  @NonNull
  public final Button buttonChange;

  @NonNull
  public final TextView textToBeChanged;

  @NonNull
  public final EditText userInput;

  private ActivityMainBinding(@NonNull LinearLayout rootView, @NonNull Button buttonActivity,
      @NonNull Button buttonChange, @NonNull TextView textToBeChanged,
      @NonNull EditText userInput) {
    this.rootView = rootView;
    this.buttonActivity = buttonActivity;
    this.buttonChange = buttonChange;
    this.textToBeChanged = textToBeChanged;
    this.userInput = userInput;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonActivity;
      Button buttonActivity = ViewBindings.findChildViewById(rootView, id);
      if (buttonActivity == null) {
        break missingId;
      }

      id = R.id.buttonChange;
      Button buttonChange = ViewBindings.findChildViewById(rootView, id);
      if (buttonChange == null) {
        break missingId;
      }

      id = R.id.textToBeChanged;
      TextView textToBeChanged = ViewBindings.findChildViewById(rootView, id);
      if (textToBeChanged == null) {
        break missingId;
      }

      id = R.id.userInput;
      EditText userInput = ViewBindings.findChildViewById(rootView, id);
      if (userInput == null) {
        break missingId;
      }

      return new ActivityMainBinding((LinearLayout) rootView, buttonActivity, buttonChange,
          textToBeChanged, userInput);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
