package com.ypwang.plugin.model

data class Position(
        val Filename: String,
        val Offset: Int,
        val Line: Int,
        val Column: Int
)

data class Replacement(
        val NeedOnlyDelete: Boolean,
        val NewLines: List<String>?
)

data class LintIssue(
        val FromLinter: String,
        val Text: String,
        val Pos: Position,
        val SourceLines: List<String>,
        val Replacement: Replacement?
)

data class Linter(
        val Name: String,
        val Enabled: Boolean?,
        val EnabledByDefault: Boolean?
)

data class Linters(
        val Linters: List<Linter>
)

data class LintReport(
        val Issues: List<LintIssue>,
        val Report: Linters
)