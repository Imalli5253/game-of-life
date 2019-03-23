job('GameOfLife')
{
	scm{
		git('https://github.com/Imalli5253/game-of-life.git')
	}
triggers{
	scm('H/5 * * * *')
	}
steps {
	shell('mvn -e clean test')
	shell('mvn package')
	archive 'gameoflife-web/target/gameoflife.war'
	}
}
