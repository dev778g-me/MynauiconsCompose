package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Subtract: ImageVector
    get() {
        if (_Subtract != null) {
            return _Subtract!!
        }
        _Subtract = ImageVector.Builder(
            name = "Outline.Subtract",
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
                moveTo(15.6f, 4.35f)
                verticalLineTo(3f)
                horizontalLineToRelative(-1.8f)
                moveTo(8.4f, 3f)
                horizontalLineToRelative(1.8f)
                moveTo(4.8f, 3f)
                horizontalLineTo(3f)
                verticalLineToRelative(1.8f)
                moveToRelative(0f, 5.4f)
                verticalLineTo(8.4f)
                moveToRelative(0f, 5.4f)
                verticalLineToRelative(1.8f)
                horizontalLineToRelative(1.35f)
                moveToRelative(5.85f, 0f)
                horizontalLineTo(8.4f)
                verticalLineToRelative(0.6f)
                curveToRelative(0f, 1.68f, 0f, 2.52f, 0.327f, 3.162f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.311f, 1.311f)
                curveTo(10.68f, 21f, 11.52f, 21f, 13.2f, 21f)
                horizontalLineToRelative(3f)
                curveToRelative(1.68f, 0f, 2.52f, 0f, 3.162f, -0.327f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.311f, -1.311f)
                curveTo(21f, 18.72f, 21f, 17.88f, 21f, 16.2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.68f, 0f, -2.52f, -0.327f, -3.162f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.311f, -1.311f)
                curveTo(18.72f, 8.4f, 17.88f, 8.4f, 16.2f, 8.4f)
                horizontalLineToRelative(-0.6f)
                verticalLineToRelative(1.8f)
                moveToRelative(-1.8f, 5.4f)
                horizontalLineToRelative(1.8f)
                verticalLineToRelative(-1.8f)
            }
        }.build()

        return _Subtract!!
    }

@Suppress("ObjectPropertyName")
private var _Subtract: ImageVector? = null
