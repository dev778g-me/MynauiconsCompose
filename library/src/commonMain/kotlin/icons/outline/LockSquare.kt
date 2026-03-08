package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LockSquare: ImageVector
    get() {
        if (_LockSquare != null) {
            return _LockSquare!!
        }
        _LockSquare = ImageVector.Builder(
            name = "Outline.LockSquare",
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
                horizontalLineTo(9.4f)
                curveToRelative(-2.24f, 0f, -3.36f, 0f, -4.216f, -0.436f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.748f, -1.748f)
                curveTo(3f, 17.96f, 3f, 16.84f, 3f, 14.6f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.004f, 10.947f)
                verticalLineTo(8.925f)
                curveToRelative(0f, -2.641f, -4.008f, -2.491f, -4.008f, 0f)
                verticalLineToRelative(2.021f)
                moveToRelative(-0.994f, 0f)
                horizontalLineToRelative(5.996f)
                curveToRelative(0.553f, 0f, 1.002f, 0.453f, 1.002f, 1.011f)
                verticalLineToRelative(3.032f)
                curveToRelative(0f, 0.558f, -0.449f, 1.011f, -1.002f, 1.011f)
                horizontalLineTo(9.002f)
                arcTo(1.006f, 1.006f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 14.99f)
                verticalLineToRelative(-3.033f)
                curveToRelative(0f, -0.558f, 0.449f, -1.01f, 1.002f, -1.01f)
            }
        }.build()

        return _LockSquare!!
    }

@Suppress("ObjectPropertyName")
private var _LockSquare: ImageVector? = null
