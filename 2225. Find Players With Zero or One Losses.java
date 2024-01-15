class Solution {
    public List<List<Integer>> findWinners(int[][] matches) 
    {
         Map<Integer, Integer> hm = new HashMap<>();

        // Update loss count for each player
        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];

            hm.put(winner, hm.getOrDefault(winner, 0));
            hm.put(loser, hm.getOrDefault(loser, 0) + 1);
        }

        List<Integer> zeroLossPlayers = new ArrayList<>();
        List<Integer> oneLossPlayers = new ArrayList<>();

        // Populate lists based on loss counts
        for (int player : hm.keySet()) {
            int losses = hm.get(player);

            if (losses == 0) {
                zeroLossPlayers.add(player);
            } else if (losses == 1) {
                oneLossPlayers.add(player);
            }
        }

        // Sort the lists
        Collections.sort(zeroLossPlayers);
        Collections.sort(oneLossPlayers);

        // Create the result list
        List<List<Integer>> result = new ArrayList<>();
        result.add(zeroLossPlayers);
        result.add(oneLossPlayers);

        return result;
        
    }
}