@echo off

call maveninstall.cmd
call dockerbuild.cmd
call dockerrun.cmd