package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LockDiamond: ImageVector
    get() {
        if (_LockDiamond != null) {
            return _LockDiamond!!
        }
        _LockDiamond = ImageVector.Builder(
            name = "Outline.LockDiamond",
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
                moveTo(2.707f, 10.295f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.41f)
                lineToRelative(7.588f, 7.588f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.41f, 0f)
                lineToRelative(7.588f, -7.588f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.41f)
                lineToRelative(-7.588f, -7.588f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.41f, 0f)
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

        return _LockDiamond!!
    }

@Suppress("ObjectPropertyName")
private var _LockDiamond: ImageVector? = null
