package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CircleDashed: ImageVector
    get() {
        if (_CircleDashed != null) {
            return _CircleDashed!!
        }
        _CircleDashed = ImageVector.Builder(
            name = "Outline.CircleDashed",
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
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.706f, 3.5f)
                moveTo(12f, 21f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.5f, -0.706f)
                moveTo(3f, 12f)
                curveToRelative(0f, -1.241f, 0.251f, -2.424f, 0.706f, -3.5f)
                moveTo(12f, 3f)
                curveToRelative(1.241f, 0f, 2.424f, 0.251f, 3.5f, 0.706f)
                moveToRelative(-9.864f, 1.93f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 3.706f)
                moveToRelative(9.864f, 14.658f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.864f, 1.93f)
                moveToRelative(2.864f, -14.658f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.93f, 2.864f)
                moveTo(5.636f, 18.364f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.93f, -2.864f)
            }
        }.build()

        return _CircleDashed!!
    }

@Suppress("ObjectPropertyName")
private var _CircleDashed: ImageVector? = null
