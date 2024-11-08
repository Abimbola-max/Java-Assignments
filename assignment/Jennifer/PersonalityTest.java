String[][] questions = {
	    ["A. expend energy, enjoy groups", "conserve energy, enjoy one on one"],
            ["A. interpret respect", "B. look for meaning and possibilities"],
            {"A. logical thinking, questioning", "B. empathetic feeling, accommodating"},
            {"A. organized, orderly", "B. flexible, adaptable"},
            {"A. more outgoing, think out loud", "B. more reserved, think to yourself"},
            {"A. practical, realistic, experiential", "B. imaginative, innovative, theoretical"},
            {"A. candid, straightforward, frank", "B. tactful, kind, encouraging"},
            {"A. plan, schedule", "B. unplanned, spontaneous"},
            {"A. seek many tasks, public activities", "B. seek private, solitary activities"},
            {"A. standard, usual, conventional", "B. different, novel, unique"},
            {"A. firm, tend to criticize", "B. gentle, tend to appreciate"},
            {"A. regulated, structured", "B. easy-going, live and let live"},
            {"A. external communicative", "B. internal reticent"},
            {"A. focus on here and now", "B. look to the future"},
            {"A. tough-minded, just", "B. tender-hearted, merciful"},
            {"A. preparation, plan ahead", "B. go with the flow"},
            {"A. active, initiate", "B. reflective, deliberate"},
            {"A. facts, things, what is", "B. ideas, dreams, what could be"},
            {"A. matter of fact", "B. sensitive, people-oriented"},
            {"A. control, govern", "B. latitude, freedom"}
        };

        int question = input.nextInt();
        
        for (int i = 0; i < 20; i++) {
            System.out.println("Questions " + (i + 1) + ":");
            System.out.println(questions[i][0]);
            System.out.println(questions[i][1]);
            }
            
           char response;
		do {
   			 System.out.print("Your answer (A/B): ");
    			 response = input.nextLine().toUpperCase().charAt(0);
    				if (response != 'A' && response != 'B') {
       				 System.out.println("Invalid input! Please enter 'A' or 'B'.");
    				}
		} while (response != 'A' && response != 'B');

	
}
    }
            
            