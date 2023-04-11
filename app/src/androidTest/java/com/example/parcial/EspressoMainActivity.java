package com.example.parcial;

import androidx.test.espresso.action.ViewActions;
import androidx.test.ext.junit.runners.AndroidJUnit4;


import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;

import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class EspressoMainActivity {


    @Test
    public void textoUsuario(){
        onView(withId(R.id.usuario))
                .perform(typeText("slopez404"), ViewActions.closeSoftKeyboard());

}

    @Test
    public void textoPassword(){
        onView(withId(R.id.password))
                .perform(typeText("12312412"), ViewActions.closeSoftKeyboard());

    }


}
