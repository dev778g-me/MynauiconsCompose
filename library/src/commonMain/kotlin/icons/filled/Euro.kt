package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Euro: ImageVector
    get() {
        if (_Euro != null) {
            return _Euro!!
        }
        _Euro = ImageVector.Builder(
            name = "Filled.Euro",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.914f, 4.815f)
                curveTo(10.328f, 3.702f, 12.229f, 3.25f, 14.5f, 3.25f)
                curveToRelative(2.514f, 0f, 4.573f, 0.554f, 6.02f, 1.942f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.04f, 1.082f)
                curveToRelative(-1.05f, -1.01f, -2.658f, -1.524f, -4.98f, -1.524f)
                curveToRelative(-2.098f, 0f, -3.613f, 0.421f, -4.659f, 1.244f)
                curveToRelative(-0.877f, 0.69f, -1.506f, 1.73f, -1.834f, 3.256f)
                horizontalLineTo(14f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineTo(7.796f)
                quadToRelative(-0.046f, 0.59f, -0.046f, 1.25f)
                reflectiveQuadToRelative(0.046f, 1.25f)
                horizontalLineTo(14f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineTo(8.007f)
                curveToRelative(0.328f, 1.526f, 0.957f, 2.566f, 1.834f, 3.256f)
                curveToRelative(1.046f, 0.823f, 2.56f, 1.244f, 4.659f, 1.244f)
                curveToRelative(2.322f, 0f, 3.93f, -0.515f, 4.98f, -1.524f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.04f, 1.082f)
                curveToRelative(-1.447f, 1.388f, -3.506f, 1.942f, -6.02f, 1.942f)
                curveToRelative(-2.271f, 0f, -4.172f, -0.452f, -5.586f, -1.565f)
                curveToRelative(-1.289f, -1.014f, -2.079f, -2.5f, -2.436f, -4.435f)
                horizontalLineTo(4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(2.292f)
                quadToRelative(-0.042f, -0.6f, -0.042f, -1.25f)
                reflectiveQuadToRelative(0.042f, -1.25f)
                horizontalLineTo(4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(2.478f)
                curveToRelative(0.357f, -1.934f, 1.147f, -3.42f, 2.436f, -4.435f)
            }
        }.build()

        return _Euro!!
    }

@Suppress("ObjectPropertyName")
private var _Euro: ImageVector? = null
