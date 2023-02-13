package ch02.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String readNumber() throws IOException {
        return br.readLine();
    }
}
