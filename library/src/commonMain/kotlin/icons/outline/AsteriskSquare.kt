package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.AsteriskSquare: ImageVector
    get() {
        if (_AsteriskSquare != null) {
            return _AsteriskSquare!!
        }
        _AsteriskSquare = ImageVector.Builder(
            name = "Outline.AsteriskSquare",
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
                moveTo(3f, 9.4f)
                curveToRelative(0f, -2.24f, 0f, -3.36f, 0.436f, -4.216f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.748f, -1.748f)
                curveTo(6.04f, 3f, 7.16f, 3f, 9.4f, 3f)
                horizontalLineToRelative(5.2f)
                curveToRelative(2.24f, 0f, 3.36f, 0f, 4.216f, 0.436f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.748f, 1.748f)
                curveTo(21f, 6.04f, 21f, 7.16f, 21f, 9.4f)
                verticalLineToRelative(5.2f)
                curveToRelative(0f, 2.24f, 0f, 3.36f, -0.436f, 4.216f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.748f, 1.748f)
                curveTo(17.96f, 21f, 16.84f, 21f, 14.6f, 21f)
                lineTo(9.4f, 21f)
                curveToRelative(-2.24f, 0f, -3.36f, 0f, -4.216f, -0.436f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.748f, -1.748f)
                curveTo(3f, 17.96f, 3f, 16.84f, 3f, 14.6f)
                close()
                moveTo(12f, 8.5f)
                verticalLineToRelative(7f)
                moveToRelative(-3f, -1.75f)
                lineToRelative(6f, -3.5f)
                moveToRelative(-6f, 0f)
                lineToRelative(6f, 3.5f)
            }
        }.build()

        return _AsteriskSquare!!
    }

@Suppress("ObjectPropertyName")
private var _AsteriskSquare: ImageVector? = null
