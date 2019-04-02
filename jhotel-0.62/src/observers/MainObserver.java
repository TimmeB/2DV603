package observers;

public interface MainObserver {
    void updateLoadGuest(String[] entry);
    void updateSetEnable(boolean b);
    void updateTempGuestData();
    void updateTempGuest(String[] strings);


    void updateYesNoDialog(String[] strings, String s1, String s2);
    void updateYesNoDialog(String[] strings, String s);
    void updateYesNoDialog(String action);

    void updateGoBackToMain(boolean b);
}
