package gent.zeus.tappb;

import androidx.fragment.app.DialogFragment;

public interface BasicDialogListener {
    void onDialogPositiveClick(DialogFragment dialog);
    void onDialogNegativeClick(DialogFragment dialog);
}
