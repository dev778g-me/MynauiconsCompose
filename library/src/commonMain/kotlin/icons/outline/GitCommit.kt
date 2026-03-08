package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.GitCommit: ImageVector
    get() {
        if (_GitCommit != null) {
            return _GitCommit!!
        }
        _GitCommit = ImageVector.Builder(
            name = "Outline.GitCommit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                moveToRelative(-9f, -3f)
                horizontalLineToRelative(6f)
                moveToRelative(6f, 0f)
                horizontalLineToRelative(6f)
            }
        }.build()

        return _GitCommit!!
    }

@Suppress("ObjectPropertyName")
private var _GitCommit: ImageVector? = null
