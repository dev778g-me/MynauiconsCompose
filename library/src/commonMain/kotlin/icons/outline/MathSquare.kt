package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.MathSquare: ImageVector
    get() {
        if (_MathSquare != null) {
            return _MathSquare!!
        }
        _MathSquare = ImageVector.Builder(
            name = "Outline.MathSquare",
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
                moveTo(7f, 15.625f)
                horizontalLineToRelative(3.5f)
                moveToRelative(3.25f, -5.5f)
                horizontalLineToRelative(3.5f)
                moveToRelative(-3.5f, -2.5f)
                horizontalLineToRelative(3.5f)
                moveToRelative(-10.5f, 1.25f)
                horizontalLineToRelative(2f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(2f)
                moveToRelative(-2f, 0f)
                verticalLineToRelative(-2f)
                moveToRelative(0f, 2f)
                verticalLineToRelative(2f)
                moveToRelative(5.35f, 6.25f)
                lineToRelative(1.414f, -1.414f)
                moveToRelative(0f, 0f)
                lineToRelative(1.415f, -1.414f)
                moveToRelative(-1.415f, 1.414f)
                lineTo(14.1f, 14.296f)
                moveToRelative(1.414f, 1.415f)
                lineToRelative(1.415f, 1.414f)
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
                horizontalLineTo(9.4f)
                curveToRelative(-2.24f, 0f, -3.36f, 0f, -4.216f, -0.436f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.748f, -1.748f)
                curveTo(3f, 17.96f, 3f, 16.84f, 3f, 14.6f)
                close()
            }
        }.build()

        return _MathSquare!!
    }

@Suppress("ObjectPropertyName")
private var _MathSquare: ImageVector? = null
