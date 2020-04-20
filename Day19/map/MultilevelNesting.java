package ringo.day19.map;

import java.rmi.server.ServerCloneException;
import java.util.*;

/**
 * 集合的多层嵌套
 *
 * @author ringo
 * @version 1.0
 * @date 2020/4/20 08:40
 */
public class MultilevelNesting {
    public static void main(String[] args) {
//        联赛集合--球队集合--球员对象
        // 创建五大联赛集合
        HashMap<String, HashMap<String, ArrayList<Player>>> leagueMap = new HashMap<String, HashMap<String, ArrayList<Player>>>();

        // 创建各自联赛集合
        HashMap<String, ArrayList<Player>> italyMap = new HashMap<String, ArrayList<Player>>();
        // 创建球队集合
        ArrayList<Player> juveList = new ArrayList<Player>();
        // 添加球员
        Player dybala = new Player("dybala", 27);
        Player cris = new Player("Ronaldo", 34);
        // 球员加入球队集合
        juveList.add(dybala);
        juveList.add(cris);
        // 球队集合加入联赛集合
        italyMap.put("尤文", juveList);
        // 球队集合加入五大联赛集合
        leagueMap.put("意甲", italyMap);

        // 创建各自联赛集合
        HashMap<String, ArrayList<Player>> englandMap = new HashMap<String, ArrayList<Player>>();
        // 创建球队集合
        ArrayList<Player> livepoolList = new ArrayList<Player>();
        // 添加球员
        Player salah = new Player("salah", 28);
        Player pogba = new Player("pogba", 27);
        // 球员加入球队集合
        livepoolList.add(salah);
        livepoolList.add(pogba);
        // 球队集合加入联赛集合
        englandMap.put("利物浦", livepoolList);
        // 球队集合加入五大联赛集合
        leagueMap.put("英超", englandMap);
        
        
        // 遍历
        Set<String> leagueSet = leagueMap.keySet();

        // 拿到键值集合获取各个键
        for (String leagueString: leagueSet) {
            System.out.println(leagueString);
            // 获取联赛集合
            HashMap<String, ArrayList<Player>> league = leagueMap.get(leagueString);
            // 遍历联赛集合
            Set<String> teamSet = league.keySet();
            for (String teamString : teamSet) {
                System.out.println(teamString);
                // 获取球队集合
                ArrayList<Player> playersArray = league.get(teamString);
                // 遍历球队集合
                for (int i = 0; i < playersArray.size(); i++) {
                    Player player = playersArray.get(i);
                    System.out.println(player.getName() + " -- " +player.getAge());
                }
            }

        }





    }
}
