package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Copy: ImageVector
    get() {
        if (_Copy != null) {
            return _Copy!!
        }
        _Copy = ImageVector.Builder(
            name = "Outline.Copy",
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
                moveTo(20.829f, 12.861f)
                curveToRelative(0.171f, -0.413f, 0.171f, -0.938f, 0.171f, -1.986f)
                reflectiveCurveToRelative(0f, -1.573f, -0.171f, -1.986f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.218f, -1.218f)
                curveToRelative(-0.413f, -0.171f, -0.938f, -0.171f, -1.986f, -0.171f)
                horizontalLineTo(11.1f)
                curveToRelative(-1.26f, 0f, -1.89f, 0f, -2.371f, 0.245f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.984f, 0.984f)
                curveTo(7.5f, 9.209f, 7.5f, 9.839f, 7.5f, 11.1f)
                verticalLineToRelative(6.525f)
                curveToRelative(0f, 1.048f, 0f, 1.573f, 0.171f, 1.986f)
                curveToRelative(0.229f, 0.551f, 0.667f, 0.99f, 1.218f, 1.218f)
                curveToRelative(0.413f, 0.171f, 0.938f, 0.171f, 1.986f, 0.171f)
                reflectiveCurveToRelative(1.573f, 0f, 1.986f, -0.171f)
                moveToRelative(7.968f, -7.968f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.218f, 1.218f)
                curveToRelative(-0.413f, 0.171f, -0.938f, 0.171f, -1.986f, 0.171f)
                reflectiveCurveToRelative(-1.573f, 0f, -1.986f, 0.171f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.218f, 1.218f)
                curveToRelative(-0.171f, 0.413f, -0.171f, 0.938f, -0.171f, 1.986f)
                reflectiveCurveToRelative(0f, 1.573f, -0.171f, 1.986f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.218f, 1.218f)
                moveToRelative(7.968f, -7.968f)
                arcToRelative(11.68f, 11.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.75f, 7.9f)
                lineToRelative(-0.218f, 0.068f)
                moveTo(16.5f, 7.5f)
                verticalLineToRelative(-0.9f)
                curveToRelative(0f, -1.26f, 0f, -1.89f, -0.245f, -2.371f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.983f, -0.984f)
                curveTo(14.79f, 3f, 14.16f, 3f, 12.9f, 3f)
                horizontalLineTo(6.6f)
                curveToRelative(-1.26f, 0f, -1.89f, 0f, -2.371f, 0.245f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.984f, 0.984f)
                curveTo(3f, 4.709f, 3f, 5.339f, 3f, 6.6f)
                verticalLineToRelative(6.3f)
                curveToRelative(0f, 1.26f, 0f, 1.89f, 0.245f, 2.371f)
                curveToRelative(0.216f, 0.424f, 0.56f, 0.768f, 0.984f, 0.984f)
                curveToRelative(0.48f, 0.245f, 1.111f, 0.245f, 2.372f, 0.245f)
                horizontalLineTo(7.5f)
            }
        }.build()

        return _Copy!!
    }

@Suppress("ObjectPropertyName")
private var _Copy: ImageVector? = null
