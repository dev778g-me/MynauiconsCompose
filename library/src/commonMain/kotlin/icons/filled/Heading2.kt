package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Heading2: ImageVector
    get() {
        if (_Heading2 != null) {
            return _Heading2!!
        }
        _Heading2 = ImageVector.Builder(
            name = "Filled.Heading2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.75f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(6.75f)
                horizontalLineToRelative(8f)
                verticalLineTo(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                verticalLineToRelative(15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-6.75f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(6.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                moveToRelative(13.523f, 6.926f)
                curveToRelative(-0.3f, 0.26f, -0.523f, 0.66f, -0.523f, 1.263f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                curveToRelative(0f, -1.023f, 0.401f, -1.842f, 1.04f, -2.396f)
                curveToRelative(0.623f, -0.54f, 1.43f, -0.793f, 2.21f, -0.793f)
                reflectiveCurveToRelative(1.587f, 0.253f, 2.21f, 0.793f)
                curveToRelative(0.639f, 0.554f, 1.04f, 1.373f, 1.04f, 2.396f)
                curveToRelative(0f, 0.942f, -0.41f, 1.769f, -0.925f, 2.476f)
                curveToRelative(-0.513f, 0.704f, -1.184f, 1.363f, -1.803f, 1.963f)
                lineToRelative(-0.096f, 0.093f)
                curveToRelative(-0.601f, 0.583f, -1.145f, 1.11f, -1.552f, 1.634f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.42f, 0.645f)
                horizontalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                curveToRelative(0f, -0.885f, 0.432f, -1.661f, 0.939f, -2.315f)
                curveToRelative(0.475f, -0.612f, 1.091f, -1.209f, 1.668f, -1.767f)
                lineToRelative(0.121f, -0.117f)
                curveToRelative(0.631f, -0.613f, 1.21f, -1.185f, 1.634f, -1.769f)
                curveToRelative(0.423f, -0.581f, 0.638f, -1.098f, 0.638f, -1.593f)
                curveToRelative(0f, -0.603f, -0.224f, -1.003f, -0.523f, -1.263f)
                curveToRelative(-0.314f, -0.272f, -0.757f, -0.426f, -1.227f, -0.426f)
                reflectiveCurveToRelative(-0.913f, 0.154f, -1.227f, 0.426f)
            }
        }.build()

        return _Heading2!!
    }

@Suppress("ObjectPropertyName")
private var _Heading2: ImageVector? = null
