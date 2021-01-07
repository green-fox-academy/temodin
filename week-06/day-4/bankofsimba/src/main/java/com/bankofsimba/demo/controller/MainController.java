package com.bankofsimba.demo.controller;

import com.bankofsimba.demo.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class MainController {

    private List<BankAccount> accounts = new ArrayList<>();

    public MainController() {
        accounts.add(new BankAccount("Simba", 2000.00, "lion", "Zebra", false, true));
        accounts.add(new BankAccount("Timon", 1000.55, "meerkat", "Bugs", false, true));
        accounts.add(new BankAccount("Pumba", 1500.00, "warthog", "Bugs", false, true));
        accounts.add(new BankAccount("Mufasa", 3000.00, "lion", "Jackal", true, true));
        accounts.add(new BankAccount("Zordon", 2500.00, "lion", "Jackal", false, false));
    }

    @GetMapping("/show")
    public String showAccount(Model model) {
        model.addAttribute("accounts", accounts);
        return "show";
    }

    @GetMapping("/showtable")
    public String showAccountInTable(Model model) {
        model.addAttribute("accounts", accounts);
        BankAccount account = new BankAccount();
        model.addAttribute("name",account.getName());
        model.addAttribute("balance",account.getBalance());
        model.addAttribute("animalType",account.getAnimalType());
        model.addAttribute("currency",account.getCurrency());
        model.addAttribute("isKing",account.getGood());
        model.addAttribute("isGood",account.getKing());

        return "showtable";
    }

    @GetMapping("/text")
    public String responseText(Model model) {
        model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "text";
    }

    @PostMapping("/increasebalance")
    public String increaseBalance(@RequestParam String name, BankAccount account) {
        Optional<BankAccount> optionalAccount = getBankAccountByName(name);
        if (optionalAccount.isPresent()) {
            BankAccount currentAccount = optionalAccount.get();
            currentAccount.increaseBalance();
        }
        return "redirect:/showtable";
    }

    private Optional<BankAccount> getBankAccountByName(String name) {
        return accounts
                .stream()
                .filter(b -> b.getName().equals(name))
                .findFirst();
    }

//    @PostMapping("/addaccount")
//    public String addAccount(@ModelAttribute BankAccount account, Model model){
//        model.addAttribute("account", account);
//        accounts.add(account);
//        return "redirect:/showtable";
//    }

}
