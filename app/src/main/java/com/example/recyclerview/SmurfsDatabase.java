package com.example.recyclerview;


import java.util.ArrayList;

public class SmurfsDatabase {
    private static String[] smurfNames = {
            "Papa Smurf",
            "Smurfette",
            "Brainy Smurf",
            "Clumsy Smurf",
            "Grouchy Smurf",
            "Sloppy Smurf",
            "Painter Smurf",
            "Poet Smurf",
            "Jokey Smurf",
            "Scaredy Smurf"
    };

    private static String[] smurfDesc = {
           "Papa Smurf is the leader and elder of the Smurfs and can be easily distinguished by his red clothes, bushy white moustache and beard. The Smurfs turn to Papa Smurf when things go wrong. Papa Smurf is skilled in making magical spells and potions. He is much older than the other Smurfs (except for Grandpa and Nanny, who are older than Papa). Papa Smurf often serves the other Smurfs with his knowledge and wisdom and usually devises a plan for how to get out of trouble or to save the Smurf village from attacks by Gargamel. Unlike the other male Smurfs, Papa Smurf's trousers and hat are red instead of white.",
            "Smurfette is a female Smurf who was created by Gargamel. She originally had black hair, though when Papa Smurf made her good, her hair became blond. Before the smurflings created Sassette, Smurfette was the only female smurf in the Smurf village. Most of the time Smurfette is portrayed as an object of admiration of many other Smurfs, since she is the only female Smurf constantly in the village. She is usually hopeless in times of danger and sometimes thinks she knows it all, yet has a caring side as well.",
            "Brainy Smurf considers himself the most intelligent Smurf in the village and an expert on everything, although his actual knowledge is questionable at best; often, his attempts to help in a given situation lead to even more problems. He can be distinguished from the others by the large glasses he wears. He also has archived his self-perceived wit and wisdom in several volumes of books entitled \"The Quotations of Brainy Smurf\". The Smurfs most often respond to his self-righteous preaching by either tossing him out of the village, clobbering him with a club (usually off screen) or simply ignoring him. His vices aside, Brainy is a good, loyal Smurf who can be counted on when the need arises, and more than once – without thinking about it – ends up doing the right thing. His original name translates to \"Smurf with Glasses\".",
            "Clumsy Smurf is a somewhat dimwitted yet amiable Smurf. In some dangerous situations he is also revealed to be quite brave too. Despite his clumsiness, he finds himself always wanting to help others and usually looks on the bright side of things. He also ends up surprising himself and others when facing consequences. He is distinguished in the cartoon series by his baggy clothing (hat hanging over his eyebrows) which adds to his clumsy appearance (his clothing is normal in the comics).\n" +
                    "In the animated series, Clumsy speaks in a variety of Southern American English.\n" +
                    "\n" +
                    "In the 2011 film, he is the main protagonist.",
            "Grouchy Smurf is the misanthropic grouch of the Smurf village. His catchphrase is \"I hate (something somebody else mentions)\" yet it is shown during the show that he is a good observer and notices kindness in others even if he is not playing active role in an event. Even though Grouchy Smurf portrays a role of a moaner within the group, he mostly wishes others to be happy and successful in order to get out of a problematic situation. Grouchy usually has a scowl on his face. In the comics version he was originally a normal Smurf, changed only when bitten by a Bzz fly in the comic story \"The Black Smurfs\" (adapted into English as \"The Purple Smurfs\").\n" +
                    "In the cartoon version, he seems to have always have been a grouch. Despite his grouchiness, he has a soft spot for Baby Smurf and the Smurflings.",

            "Sloppy Smurf is a filthy Smurf with a passion for dirt, garbage, and rotten fruit. His face is perpetually grimy, his hat is grubby and disheveled, and one of his loose stockings is perpetually torn, revealing his toes. Sloppy owns a pet fly named Fly, whom he sometimes walks on a leash and has taught to do tricks like a dog.",
            "Painter Smurf is a brilliant artist and is active in most visual arts. He often wears a red jacket with a black tie, and is often seen either making a painting or a sculpture. In the cartoon series, he speaks with a French accent and refers to his paintings as \"masterpizzes.\"\n" + "In the cartoon series, he wears a white Phrygian cap but wears a black beret in the movies.",
            "Poet Smurf is the poet of the village. He is very sensitive and artistic, and he spends most of his time wandering in nature to improvise poems about it, and sometimes has trouble finding verses that rhyme. He usually manages to do it through some accident.",
            "Jokey is the village prankster. In the TV cartoon series, Jokey Smurf almost always used the same form of \"joke\"; yellow- and red-wrapped present boxes that he offers to his victims, saying that it is a \"surprise\". When opened, the \"present\" box explodes with a sizable quantity of black smoke which blackens the receiver's face (or entire body depending on the explosion's size). Gargamel is naturally a favorite target, and Brainy is as well.",
            "Scaredy Smurf easily gets scared by anything, whether it is a small insect or the noise of a storm. He is often teased by the other Smurfs because of this."
    };

    private static int[] smurfImages = {
            R.drawable.papa,
            R.drawable.smurfette,
            R.drawable.brainy,
            R.drawable.clumsy,
            R.drawable.grouchy,
            R.drawable.sloppy,
            R.drawable.painter,
            R.drawable.poet,
            R.drawable.jokey,
            R.drawable.scaredy
    };

    static ArrayList<SmurfsModel> getListData(){
        ArrayList<SmurfsModel> list = new ArrayList<>();
        for (int position = 0; position<smurfNames.length; position++){
            SmurfsModel smurfs = new SmurfsModel();
            smurfs.setName(smurfNames[position]);
            smurfs.setSummary(smurfDesc[position]);
            smurfs.setPhoto(smurfImages[position]);
            list.add(smurfs);

        }
        return list;
    }


}
