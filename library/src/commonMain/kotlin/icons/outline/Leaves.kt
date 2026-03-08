package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Leaves: ImageVector
    get() {
        if (_Leaves != null) {
            return _Leaves!!
        }
        _Leaves = ImageVector.Builder(
            name = "Outline.Leaves",
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
                moveTo(12f, 12.07f)
                verticalLineTo(20f)
                moveToRelative(0f, -8.07f)
                curveToRelative(0f, -4.353f, 3.538f, -7.887f, 7.919f, -7.93f)
                quadToRelative(0.08f, 0.556f, 0.081f, 1.132f)
                curveToRelative(0f, 4.353f, -3.538f, 7.886f, -7.919f, 7.93f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 11.928f)
                moveToRelative(0f, 0f)
                curveTo(12f, 7.576f, 8.462f, 4.042f, 4.081f, 4f)
                quadToRelative(-0.08f, 0.556f, -0.081f, 1.132f)
                curveToRelative(0f, 4.353f, 3.538f, 7.886f, 7.919f, 7.93f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 11.928f)
            }
        }.build()

        return _Leaves!!
    }

@Suppress("ObjectPropertyName")
private var _Leaves: ImageVector? = null
