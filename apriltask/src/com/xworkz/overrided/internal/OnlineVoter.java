package com.xworkz.overrided.internal;
    public class OnlineVoter extends Voter {
        private String votingPlatform;

        public OnlineVoter(String name, String votingPlatform) {
            super(name);
            this.votingPlatform = votingPlatform;
            System.out.println(name + " registered for online voting on " + votingPlatform);
        }

        @Override
        public void vote() {
            System.out.println("Online voter is casting vote via platform: " + votingPlatform);
        }

        public void checkSecurity() {
            System.out.println("Checking security measures for online voting");
        }
    }

