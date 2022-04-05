# Check if Tree is Isomorphic
## Easy 
<div class="problem-statement">
                <p><a onclick="gtagHelperFunction('clickopen','salesevent_gsc_problemspage_promobanner')" href="https://practice.geeksforgeeks.org/summer-carnival-2022?utm_source=practiceproblems&amp;utm_medium=problemspromobanner&amp;utm_campaign=gsc22" target="_blank"></a></p><div style="margin: 14px 0px !important;" class="row"><a onclick="gtagHelperFunction('clickopen','salesevent_gsc_problemspage_promobanner')" href="https://practice.geeksforgeeks.org/summer-carnival-2022?utm_source=practiceproblems&amp;utm_medium=problemspromobanner&amp;utm_campaign=gsc22" target="_blank">             <div class="col-md-12" style="cursor:pointer;background: #EFF8F3 0% 0% no-repeat padding-box; display: flex; align-items: center; position:                 relative; padding: 1.5%; border-radius: 10px; display: inline-block; text-align: center; font-weight: 600; color: #333"> <img src="https://media.geeksforgeeks.org/img-practice/gcs2022thumbnail-1649059370.png" alt="Lamp" width="46" height="40" style="background: transparent 0% 0% no-repeat padding-box;opacity: 1; margin: 0 16px;" class="img-responsive"> Geeks Summer Carnival is LIVE NOW &nbsp; <i class="fa fa-external-link" aria-hidden="true"></i> </div></a></div><p><span style="font-size:18px">Given two&nbsp;Binary Trees. Check whether they are&nbsp;Isomorphic or not.</span></p>

<p><span style="font-size:18px"><strong>Note:&nbsp;</strong><br>
Two trees are called isomorphic if one can be obtained from another by a series of flips, i.e. by swapping left and right children of several nodes.&nbsp;Any number of nodes at any level can have their children swapped. Two empty trees are isomorphic.<br>
For example, the following two trees are isomorphic with the following sub-trees flipped: 2 and 3, NULL and 6, 7 and 8.<br>
<a href="https://media.geeksforgeeks.org/wp-content/cdn-uploads/ISomorphicTrees-e1368593305854.png" target="_blank"><img alt="ISomorphicTrees" src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/ISomorphicTrees-e1368593305854.png" class="img-responsive"></a></span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
 T1    </strong>1     <strong>T2:</strong>   1
&nbsp;    /   \        /  \
&nbsp;   2     3      3    2
&nbsp;  /            /
&nbsp; 4<strong>&nbsp;           </strong>4<strong>
Output: </strong>No<strong>
</strong></span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
T1    </strong>1     <strong>T2:</strong>    1
&nbsp;   /  \         /   \
&nbsp;  2    3       3     2
&nbsp; /                    \
&nbsp; 4<strong>&nbsp;                    </strong>4<strong>
Output: </strong>Yes<strong>
</strong></span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function<strong> isomorphic() </strong>that takes<strong>&nbsp;</strong>the root&nbsp;nodes of both the Binary Trees as its input&nbsp;and returns True if the two trees are isomorphic. Else, it returns False. (The driver code will print Yes if the returned values are true, otherwise false.)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(min(M, N)) where M and N are the sizes of the two trees.<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(min(H1, H2)) where H1 and H2 are the heights of the two trees.</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1&lt;=Number of nodes&lt;=10<sup>5</sup></span></p>
 <p></p>
            </div>