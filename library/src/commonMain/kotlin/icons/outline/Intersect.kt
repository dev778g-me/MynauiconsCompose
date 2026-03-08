package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Intersect: ImageVector
    get() {
        if (_Intersect != null) {
            return _Intersect!!
        }
        _Intersect = ImageVector.Builder(
            name = "Outline.Intersect",
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
                moveTo(8.4f, 15.6f)
                horizontalLineToRelative(2.4f)
                curveToRelative(1.68f, 0f, 2.52f, 0f, 3.162f, -0.327f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.311f, -1.311f)
                curveToRelative(0.327f, -0.642f, 0.327f, -1.482f, 0.327f, -3.162f)
                verticalLineTo(8.4f)
                moveToRelative(-7.2f, 7.2f)
                verticalLineToRelative(0.9f)
                moveToRelative(0f, -0.9f)
                verticalLineToRelative(-2.4f)
                curveToRelative(0f, -1.68f, 0f, -2.52f, 0.327f, -3.162f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.311f, -1.311f)
                curveTo(10.68f, 8.4f, 11.52f, 8.4f, 13.2f, 8.4f)
                horizontalLineToRelative(2.4f)
                moveToRelative(-7.2f, 7.2f)
                horizontalLineToRelative(-0.9f)
                moveToRelative(8.1f, -7.2f)
                horizontalLineToRelative(0.9f)
                moveToRelative(-0.9f, 0f)
                verticalLineToRelative(-0.9f)
                moveTo(8.4f, 19.65f)
                verticalLineTo(21f)
                horizontalLineToRelative(1.8f)
                moveToRelative(5.4f, 0f)
                horizontalLineToRelative(-1.8f)
                moveToRelative(5.4f, 0f)
                horizontalLineTo(21f)
                verticalLineToRelative(-1.8f)
                moveToRelative(0f, -5.4f)
                verticalLineToRelative(1.8f)
                moveToRelative(0f, -5.4f)
                verticalLineTo(8.4f)
                horizontalLineToRelative(-1.35f)
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
            }
        }.build()

        return _Intersect!!
    }

@Suppress("ObjectPropertyName")
private var _Intersect: ImageVector? = null
