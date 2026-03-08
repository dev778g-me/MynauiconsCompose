package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Snowflake: ImageVector
    get() {
        if (_Snowflake != null) {
            return _Snowflake!!
        }
        _Snowflake = ImageVector.Builder(
            name = "Outline.Snowflake",
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
                moveTo(9.953f, 3f)
                lineTo(12f, 5f)
                moveToRelative(0f, 0f)
                lineToRelative(2.047f, -2f)
                moveTo(12f, 5f)
                verticalLineToRelative(4f)
                moveTo(9.953f, 21f)
                lineTo(12f, 19f)
                moveToRelative(0f, 0f)
                lineToRelative(2.047f, 2f)
                moveTo(12f, 19f)
                verticalLineToRelative(-4f)
                moveToRelative(6.953f, -9.232f)
                lineTo(18.204f, 8.5f)
                lineTo(21f, 9.232f)
                moveTo(3f, 14.768f)
                lineToRelative(2.796f, 0.732f)
                lineToRelative(-0.75f, 2.732f)
                moveTo(21f, 14.768f)
                lineToRelative(-2.796f, 0.732f)
                lineToRelative(0.75f, 2.732f)
                moveTo(5.047f, 5.768f)
                lineTo(5.796f, 8.5f)
                lineTo(3f, 9.232f)
                moveTo(5.796f, 15.5f)
                lineToRelative(3.492f, -1.97f)
                moveToRelative(8.916f, -5.03f)
                lineToRelative(-3.492f, 1.97f)
                moveTo(5.796f, 8.5f)
                lineToRelative(3.492f, 1.97f)
                moveToRelative(8.916f, 5.03f)
                lineToRelative(-3.492f, -1.97f)
                moveToRelative(-5.424f, -3.06f)
                lineToRelative(-0.132f, 0.132f)
                arcToRelative(0.47f, 0.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.156f, 0.377f)
                verticalLineToRelative(2.042f)
                curveToRelative(0f, 0.162f, 0.038f, 0.26f, 0.156f, 0.377f)
                lineToRelative(0.132f, 0.132f)
                moveToRelative(0f, -3.06f)
                lineToRelative(1.314f, -1.314f)
                arcTo(0.47f, 0.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.979f, 9f)
                horizontalLineToRelative(2.042f)
                curveToRelative(0.162f, 0f, 0.26f, 0.038f, 0.377f, 0.156f)
                lineToRelative(1.314f, 1.314f)
                moveToRelative(0f, 0f)
                lineToRelative(0.132f, 0.132f)
                arcToRelative(0.47f, 0.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.156f, 0.377f)
                verticalLineToRelative(2.042f)
                arcToRelative(0.47f, 0.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.156f, 0.377f)
                lineToRelative(-0.132f, 0.132f)
                moveToRelative(0f, 0f)
                lineToRelative(-1.314f, 1.314f)
                arcToRelative(0.47f, 0.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.377f, 0.156f)
                horizontalLineTo(10.98f)
                arcToRelative(0.47f, 0.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.377f, -0.156f)
                lineTo(9.288f, 13.53f)
            }
        }.build()

        return _Snowflake!!
    }

@Suppress("ObjectPropertyName")
private var _Snowflake: ImageVector? = null
