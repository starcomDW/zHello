treat workspace as owner, also in tmp workspace

this commit is before this was pulled

Parent: b521a47d174835758d3fa951388f730711623465 (Adding genotyping)
Branches: master, origin/master

Setting jdk for java 1.8

----------------
after did a git pull merge and the history looks like:

commit d310fb47d94bf80b9aed116e26f419cbf44e366b (HEAD -> master, origin/master)
Author: Dean <deanw@starcomsoft.com>
Date:   Wed Jan 10 18:47:17 2018 -0800

    Adding a readme

commit c5ccc6906b2597411844d0a117023ef480b2adec
Author: Dean <deanw@starcomsoft.com>
Date:   Wed Jan 10 18:43:44 2018 -0800

    Setting jdk for java 1.8
    
notice there's no merge commit and it looks like this commit was
done after doing a pull of c5ccc6906b2597411844d0a117023ef480b2adec

in other words it's a fast forward merge