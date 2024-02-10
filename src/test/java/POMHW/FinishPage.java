package POMHW;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import static com.codeborne.selenide.Selenide.$;

@Accessors(fluent = true)
@NoArgsConstructor
@Getter
public class FinishPage {

    public static SelenideElement header = $("h2.complete-header");
}
